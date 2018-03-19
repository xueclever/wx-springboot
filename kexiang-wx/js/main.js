// 全局变量
var loadedScroll,iScroll;
$(function(){

  		//创建蒙版告知竖屏查看
	var tipWatch = null;
	// 横屏监听
	var updateOrientation = function(){
		if(tipWatch == null) {
			tipWatch = $('<div class="position tipWatch" id="tipWatch">< img src="images/index.png" class="tip_rotate" /><p>为了更好的浏览体验，请将手机竖屏浏览</p ></div>');
		}
	    if(window.orientation=='-90' || window.orientation=='90'){
			//alert('为了更好的体验，请将手机/平板竖过来！')
			tipWatch.css("display","block");
			//$(".custom").css({"transform":"rotate(90deg)","-webkit-transform":"rotate(90deg)"});
			$("body").append(tipWatch);
	    }else{
	        console.log('竖屏状态');
	        //$(".custom").css({"transform":"rotate(0)","-webkit-transform":"rotate(0)"});
//	        tipWatch.css("display","none");
	        tipWatch.remove();
	    }
	};


	//手机端判断各个平台浏览器及操作系统平台
	// function checkPlatform(){
	// 	if(/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)){
	// 		//这是iOS平台下浏览器
	// 		swiperForIOS();
	// 	}else{
	// 		//这是Android及其他平台下浏览器
	// 		swiperForAndroid();
	// 	}
	// 	if(/MicroMessenger/i.test(navigator.userAgent)){
	// 		//这是微信平台下浏览器
	// 	}
	// };
	// checkPlatform();

	




	// //滚动条事件
	// loadedScroll = function(id,bleX,bleY) {
	// 	iScroll = new IScroll(id, {
	// 		scrollbars: true,
	// 		click:true,
	// 		interactiveScrollbars: true,
	// 		shrinkScrollbars: 'scale',
	// 		fadeScrollbars: true,
	// 		scrollX: bleX, 
	// 		scrollY: bleY,
	// 		scrollbars: 'custom'
	// 	});
	// };
	// document.addEventListener('touchmove', function (e) { e.preventDefault(); }, false);
	
	
	

	// 返回历史记录上一页
	$('.return').on("touchend",function(){
		window.history.go(-1);
	});


 



 
	
});