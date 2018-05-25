$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });
	
	//for accessing ag img and description in result
	
//for accessing ag img and description in notices
	
	var $imgrn=$('#imgrn');
	
	if($imgrn.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
		 switch(jsonURL){
		case contextRoot+'/ag/all/results':
			jsonUrl=contextRoot+'/ag/all/results';
			break;
		case contextRoot+'/ag/all/notices':
			jsonUrl=contextRoot+'/ag/all/notices';
			break;

		case contextRoot+'/fis/all/results':
			jsonUrl=contextRoot+'/fis/all/results';
			break;
		case contextRoot+'/fis/all/notices':
			jsonUrl=contextRoot+'/fis/all/notices';
			break;
			
		
		case contextRoot+'/bba/all/results':
			jsonUrl=contextRoot+'/bba/all/results';
			break;
		case contextRoot+'/bba/all/notices':
			jsonUrl=contextRoot+'/bba/all/notices';
			break;
			
		case contextRoot+'/cse/all/results':
			jsonUrl=contextRoot+'/cse/all/results';
			break;
		case contextRoot+'/cse/all/notices':
			jsonUrl=contextRoot+'/cse/all/notices';
			break;
		case contextRoot+'/dvm/all/results':
			jsonUrl=contextRoot+'/dvm/all/results';
			break;
		case contextRoot+'/dvm/all/notices':
			jsonUrl=contextRoot+'/dvm/all/notices';
			break;
		case contextRoot+'/eng/all/results':
			jsonUrl=contextRoot+'/eng/all/results';
			break;
		case contextRoot+'/eng/all/notices':
			jsonUrl=contextRoot+'/eng/all/notices';
			break;
		case contextRoot+'/sc/all/results':
			jsonUrl=contextRoot+'/sc/all/results';
			break;
		case contextRoot+'/sc/all/notices':
			jsonUrl=contextRoot+'/sc/all/notices';
			break;
		case contextRoot+'/soc/all/results':
			jsonUrl=contextRoot+'/soc/all/results';
			break;
		case contextRoot+'/soc/all/notices':
			jsonUrl=contextRoot+'/soc/all/notices';
			break;
		
		}


	
		$imgrn.DataTable({
	  lengthMenu:[[3,5,-1],['3 files','5 files','All']],
	  pageLength:3,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'id'  
		  },
		  
		  
		  {
			  data:'img_url',
			  bSortable:false,
			  mRender:function(data,type,row){
				  return '<img src="'+window.contextRoot
				  +'/assets/images/'
				  +data+'.jpg" class="agImgResults"/>';
				  
				  
				  
			  }
			  
			  
			  
		  },
		  {
			  data:'description'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	}
	
	/*alert message*/
	var alert=$('.alert');
	if(alert.length){
		setTimeout(function(){
			
			alert.fadeOut("slow");
			
			
		},3000);
		
	}
	
	//loginForm
	
	var $loginForm = $('#loginForm');

	if ($loginForm.length) {

		$loginForm.validate({
			rules : {
				username : {
					required : true,
					email : true
				},
				password : {
					required : true

				}
			},
			messages : {
				username : {
					required : 'Please enter enter the username!',
					email : 'Please enter valid email address'
				},
				password : {
					required : 'Please enter the password!'

				}
			},
			errorElement : "em",
			errorPlacement : function(error, element) {

				errorPlacement(error, element);
			}
		}

		);

	}


	//called method
	
	function errorPlacement(error,element){
		//for css coloring
		error.addClass("help-block");
		//show error msg below the label
		error.insertAfter(element);
		element.parents(".validate").addClass("has-feedback");
	}
	
	
	
	
	
	
	
});

