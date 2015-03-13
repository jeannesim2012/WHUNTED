//$(document).on("pageinit", function (event, ui) {
    $('#chat_button').click(function () {
        var message = $('textarea').val();
        var old = $('#content').html();
        $('#content').html(old + "<img src='image/sellers/bob.png' alt='' style='float: right'>"
                + "<p style='float: right; background: #99CCFF;'>" + message + '</p>');
        var timer = setInterval(function () {
            old = $('#content').html();
            $('#content').html(old + "<img src='image/sellers/seller3.png' alt='' style='float: left'>"
                    + "<p style='float: left'>" + 'Bob, I called!' + '</p>');
            clearInterval(timer);
        }, 3000);
    });
//});