var kt = 1;
$('#search').click(function () {
    if (kt % 2 != 0) {
        $('.search').css({
            'display': 'block'
        });
        $('#input').val('');
        kt++;
        $('#icon-search').css({
            'display': 'none'
        });
        $('#icon-close').css({
            'display': 'block'
        });
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
$('.slide-1').owlCarousel({
    loop: true,
    nav: true,
    dots: false,
    autoplay: true,
    autoplayTimeout: 3000,
    autoplayHoverPause: true,
    responsive: {
        0: {
            items: 1
        },
        900: {
            items: 1
        }
    }
});
$('.slide-2').owlCarousel({
    loop: true,
    nav: false,
    dots: false,
    autoplay: true,
    autoplayTimeout: 3000,
    autoplayHoverPause: true,
    responsive: {
        0: {
            items: 1
        },
        900: {
            items: 1
        }
    }
});
$('.slide-2-nav-next').click(function () {
    $('.slide-2').trigger('next.owl.carousel', [300]);
})
$('.slide-2-nav-pre').click(function () {
    $('.slide-2').trigger('prev.owl.carousel', [300]);
})
