var kt = 1;
var kt2 = 1;
$('#search').click(function () {
    if (kt % 2 != 0) {
        $('.search').css({
            'display': 'block'
        });
        $('#input').val('');
        $('#icon-search').css({
            'display': 'none'
        });
        $('#icon-close').css({
            'display': 'block'
        });
        kt++;
    } else {
        $('.search').css({
            'display': 'none'
        });
        $('#input').val('');
        $('#icon-search').css({
            'display': 'block'
        });
        $('#icon-close').css({
            'display': 'none'
        });
        kt++;
    }
});
$('#arrow-follow').click(function () {
    if (kt % 2 != 0) {
        $('.icon-follow').css({
            'display': 'none'
        });
        $('#hide-follow').css({
            'display': 'none'
        });
        $('#show-follow').css({
            'display': 'block'
        });
        kt++;
    } else {
        $('.icon-follow').css({
            'display': 'block'
        });
        $('#hide-follow').css({
            'display': 'block'
        });
        $('#show-follow').css({
            'display': 'none'
        });
        kt++;
    }
});
$('.slide-1').owlCarousel({
    loop: true,
    nav: false,
    dots: true,
    autoplay: true,
    autoplayTimeout: 3000,
    autoplayHoverPause: true,
    responsive: {
        0: {
            items: 1
        }
    }
});
