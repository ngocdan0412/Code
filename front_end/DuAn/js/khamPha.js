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
// OwlCarousel đầu tiên
$('.slider1').owlCarousel({
    items: 1, //hiển thị số ảnh
    loop: true, //vòng lặp
    margin: 10,
    autoplay: true,
    autoplayTimeout: 3000,
    autoplayHoverPause: true, //dừng tự chuyển ảnh khi đưa chuột vào
    dots: true,
    //autoplayHoverPause: true, 	//dừng tự chuyển ảnh khi đưa chuột vào
    nav: false //nút prev and next,false ẩn,true hiện
});


// OwlCarousel địa điểm khác
$('.welcome').owlCarousel({
    loop: true,
    margin: 25,
    nav: false,
    dots: false,
    autoplay: true,
    autoplayTimeout: 2000,
    autoplayHoverPause: true,
    responsive: {
        0: {
            item: 1
        },
        900: {
            item: 3
        }
    }
});
// set event remove img
// Go to the next item
$('.Tright').click(function () {
        $('.welcome').trigger('next.owl.carousel');
    })
    // Go to the previous item
$('.Tleft').click(function () {
    $('.welcome').trigger('prev.owl.carousel', [300]);
})


// responsive
function chon1() {
    // block dùng để hiển thị
    $('.khamPhaDiaDiem1').show();
    $('.plus1').hide();
    $('.minus1').show();
}

function chon2() {
    // block dùng để hiển thị
    $('.khamPhaDiaDiem2').show();
    $('.plus2').hide();
    $('.minus2').show();
}

function chon3() {
    // block dùng để hiển thị
    $('.khamPhaDiaDiem3').show();
    $('.plus3').hide();
    $('.minus3').show();
}

function chon4() {
    // block dùng để hiển thị
    $('.banQuanTam').show();
    $('.plus4').hide();
    $('.minus4').show();
}


function huy1() {
    // none dùng để ẩn
    // document.getElementById("div3").style.display = "none";
    $('.khamPhaDiaDiem1').hide();
    $('.plus1').show();
    $('.minus1').hide();
}

function huy2() {
    // none dùng để ẩn
    // document.getElementById("div3").style.display = "none";
    $('.khamPhaDiaDiem2').hide();
    $('.plus2').show();
    $('.minus2').hide();
}

function huy3() {
    // block dùng để hiển thị
    $('.khamPhaDiaDiem3').hide();
    $('.plus3').show();
    $('.minus3').hide();
}

function huy4() {
    // block dùng để hiển thị
    $('.banQuanTam').hide();
    $('.plus4').show();
    $('.minus4').hide();
}
