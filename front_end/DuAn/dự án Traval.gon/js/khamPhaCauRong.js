// OwlCarousel đầu tiên
$('.slider1').owlCarousel({
			items: 1, 	//hiển thị số ảnh
			loop: true, 	//vòng lặp
			margin: 10,
			autoplay: true,
			autoplayTimeout: 3000,
			autoplayHoverPause: true, 	//dừng tự chuyển ảnh khi đưa chuột vào
			dots: true,
			//autoplayHoverPause: true, 	//dừng tự chuyển ảnh khi đưa chuột vào
			nav: false 	//nút prev and next,false ẩn,true hiện
		});
