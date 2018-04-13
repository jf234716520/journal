/**
 * 
 */
$(function(){
	
})
/**
 * 跳转注册页
 * @returns
 */
function toRegister(){
	
	$('#login_form').css('display','none');
	$('#register_form').css('display','block');
}

/**
 * 提交注册信息
 * @returns
 */
function register(){
	
	var formData = $('#register_form').serialize();
	$.post('register.do',formData,function(data){
		BootstrapDialog.show({
			message:'注册成功'
		})
	})
}
