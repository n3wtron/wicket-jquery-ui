function getCalendarHeight() {
	return $(window).height() - $('#${markupId}').position().top - 20;
}

function setCalendarHeight() {
	$('#${markupId}').fullCalendar('option', 'height', getCalendarHeight());
}

$(function() {
	$(window).on('resize', setCalendarHeight);
	$(window).load(function() { setCalendarHeight(); } ); // (*)
});

// *
// onwindowready $(function() { }); is triggered before onwindowload.
// the calendar height may be inaccurate on 'windowready' because not fully loaded...
