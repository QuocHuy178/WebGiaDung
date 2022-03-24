/* Theam switcher js file */
$(document).ready(function() {
// Pattern Selector function//////////////////////////////////	
	$('.patterns a').click(function(e) {
		e.preventDefault();
			$(this).parent().find('img').removeClass('active');
			$(this).find('img').addClass('active');

			var name = $(this).attr('name');
				$('body').css('background', 'url(themes/switch/images/pattern/'+name+'.png) repeat center center scroll');
				$('body').css('background-size', 'auto');
	});
// Style Selector function ////////////////////////////////////
	$('.style a').click(function(e) {
		e.preventDefault();
		$(this).parent().find('img').removeClass('active');
		$(this).find('img').addClass('active');

		var name = $(this).attr('name');

		if(name == 'green') {
			$('#callCss').attr('href', '');
		} else {
			$('#callCss').attr('href', 'themes/'+name+'/bootstrap.min.css');
		}

	});
	
	/* Settings Button */
	$('#themesBtn').click(function() {
	  $('#secectionBox').animate({
		right:'0'
	  }, 500, function() {
		// Animation complete.
	  });
	  $('#themesBtn').animate({
		right:'-80'
	  }, 100, function() {
		// Animation complete.
	  });
	}); 


	$('#hideme').click(function() {
		$('#secectionBox').animate({
		right:'-999'
	  }, 500, function() {
		// Animation complete.
	  });
	  
	  $('#themesBtn').animate({
		right:'0'
	  }, 700, function() {
		// Animation complete.
	  }); 
	});

});


