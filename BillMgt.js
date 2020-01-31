$(document).ready(function() {
		//$('myform').submit(function(e) {
		    //  e.preventDefault();
		$("#billSubmit").click(function(){
		var diseases = [];
		diseases = $('input[name^=diseases]').map(function(idx, elem) {
		    return $(elem).val();
		}).get();

		event.preventDefault();

		$.ajax({
			url : "/disease/add",
			type : "POST",
			contentType : "application/json",
			data : JSON.stringify(diseases),
			success : function(data, status) {
				console.log(data);
				if (data.status) {
					// window.open("CreateEvent.jsp","_self"); //using "_self"
					// or "_parent" will open in same window and same tab
					// window.open("CreateEvent.jsp","_self");
					alert(data.responseMessage);

				} else {
					// window.open("index.jsp","_self");
					alert("not inserted");
				}
			},
			error : function(e) {
				console.log("error");
			}
		});


		  });
		 });
	
	
	
