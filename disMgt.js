
$('.multi-field-wrapper').each(function() {
	    var $wrapper = $('.multi-fields', this);
	    $(".add-field", $(this)).click(function(e) {
	        $('.multi-field:first-child', $wrapper).clone(true).appendTo($wrapper).find('input').val('').focus();
	    });
	    $('.multi-field .remove-field', $wrapper).click(function() {
	        if ($('.multi-field', $wrapper).length > 1)
	            $(this).parent('.multi-field').remove();
	    });
	});
		









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
	
	
	
