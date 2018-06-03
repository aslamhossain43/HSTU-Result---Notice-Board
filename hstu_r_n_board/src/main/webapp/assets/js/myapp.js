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
		
		
		 switch(filejsonURL){
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
			  data:'description'
			 
		  },
		  {
			  data:'img_url',
			  bSortable:false,
			  mRender:function(data,type,row){
				  return '<img src="'+window.contextRoot
				  +'/assets/images/'
				  +data+'.jpg" class="fileResults"/>';
				  
				  
				  
			  }
			  
			  
			  
		  }
		 
		  
		  
	  ]
		
		
		
		
	});
	}
//for accessing ECE l1s1 results
	
	var $eceAllresults=$('#eceAllresultsl1s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
			jsonUrl=contextRoot+'/jsonEce/allResultsL1S1';
			


	
		 $eceAllresults.DataTable({
	  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
	  pageLength:30,
	  ajax:{
		  url:jsonUrl,
		  dataSrc : ''
		 
		  
	  },
	  columns : [
		  
		  {
			data:'sid'  
		  },
		  
		  
		  {
			  data:'cse107'
			 
			  
			  
		  },
		  {
			  data:'cse108'
			 
		  },
		  {
			  data:'mat109'
			 
		  },
		  {
			  data:'aie107'
			 
		  },
		  {
			  data:'aie108'
			 
		  },
		  {
			  data:'ssl107'
			 
		  },
		  {
			  data:'phy111'
			 
		  },
		  {
			  data:'phy112'
			 
		  },
		  {
			  data:'gpa'
			 
		  }
		  
		  
		  
	  ]
		
		
		
		
	});
	} 
//for accessing ECE l1s2 results
	
	var $eceAllresults=$('#eceAllresultsl1s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL1S2';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'aie110'
					 
					  
					  
				  },
				  {
					  data:'mat113'
					 
				  },
				  {
					  data:'ece101'
					 
				  },
				  {
					  data:'ece102'
					 
				  },
				  {
					  data:'eee103'
					 
				  },
				  {
					  data:'eee104'
					 
				  },
				  {
					  data:'soc105'
					 
				  },
				  {
					  data:'cse159'
					 
				  }, {
					  data:'cse160'
					 
				  }, {
					  data:'cse161'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}

//for accessing ECE l2s1 results
	
	var $eceAllresults=$('#eceAllresultsl2s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL2S1';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'ece205'
					 
					  
					  
				  },
				  {
					  data:'ece206'
					 
				  },
				  {
					  data:'cse211'
					 
				  },
				  {
					  data:'cse212'
					 
				  },
				  {
					  data:'ece203'
					 
				  },
				  {
					  data:'ece204'
					 
				  },
				  {
					  data:'cse213'
					 
				  },
				  {
					  data:'cse214'
					 
				  }, {
					  data:'stt211'
					 
				  }, {
					  data:'stt212'
					 
				  },{
					  data:'mat205'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
//for accessing ECE l2s2 results
	
	var $eceAllresults=$('#eceAllresultsl2s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL2S2';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'ece211'
					 
					  
					  
				  },
				  {
					  data:'ece212'
					 
				  },
				  {
					  data:'ece207'
					 
				  },
				  {
					  data:'ece208'
					 
				  },
				  {
					  data:'ece209'
					 
				  },
				  {
					  data:'ece210'
					 
				  },
				  {
					  data:'eee207'
					 
				  },
				  {
					  data:'eee208'
					 
				  }, {
					  data:'cse261'
					 
				  }, {
					  data:'cse262'
					 
				  },{
					  data:'mat207'
					 
				  },{
					  data:'ece200'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
//for accessing ECE l3s1 results
	
	var $eceAllresults=$('#eceAllresultsl3s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL3S1';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'cse315'
					 
					  
					  
				  },
				  {
					  data:'cse316'
					 
				  },
				  {
					  data:'ece313'
					 
				  },
				  {
					  data:'ece314'
					 
				  },
				  {
					  data:'ece315'
					 
				  },
				  {
					  data:'ece316'
					 
				  },
				  {
					  data:'ece329'
					 
				  },
				  {
					  data:'ece330'
					 
				  }, {
					  data:'act307'
					 
				  }, {
					  data:'cse317'
					 
				  },{
					  data:'cse318'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
	
//for accessing ECE l3s2 results
	
	var $eceAllresults=$('#eceAllresultsl3s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL3S2';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'ece317'
					 
					  
					  
				  },
				  {
					  data:'ece318'
					 
				  },
				  {
					  data:'ece319'
					 
				  },
				  {
					  data:'ece320'
					 
				  },
				  {
					  data:'ece321'
					 
				  },
				  {
					  data:'ece322'
					 
				  },
				  {
					  data:'cse377'
					 
				  },
				  {
					  data:'cse378'
					 
				  }, {
					  data:'cse371'
					 
				  }, {
					  data:'cse372'
					 
				  },{
					  data:'ecn307'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
	
//for accessing ECE l4s1 results
	
	var $eceAllresults=$('#eceAllresultsl4s1');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL4S1';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				  
				  {
					  data:'eee423'
					 
					  
					  
				  },
				  {
					  data:'eee424'
					 
				  },
				  {
					  data:'ece425'
					 
				  },
				  {
					  data:'ece426'
					 
				  },
				  {
					  data:'ece451'
					 
				  },
				  {
					  data:'ece452'
					 
				  },
				  {
					  data:'ece427'
					 
				  },
				  {
					  data:'ece428'
					 
				  }, {
					  data:'ece431'
					 
				  }, {
					  data:'ece429'
					 
				  },{
					  data:'ece471'
					 
				  },
				  {
					  data:'ece402'
					 
				  },
				  {
					  data:'gpa'
					 
				  }
				  
				  
				  
			  ]
				
				
				
				
			});
	}
	
//for accessing ECE l4s2 results
	
	var $eceAllresults=$('#eceAllresultsl4s2');
	
	if($eceAllresults.length){
		console.log('inside the table');
		var jsonUrl='';
		
		
	
			jsonUrl=contextRoot+'/jsonEce/allResultsL4S2';
			
		 $eceAllresults.DataTable({
			  lengthMenu:[[30,73,-1],['30 files','73 files','All']],
			  pageLength:30,
			  ajax:{
				  url:jsonUrl,
				  dataSrc : ''
				 
				  
			  },
			  columns : [
				  
				  {
					data:'sid'  
				  },
				  
				 
				  {
					  data:'ece475'
					 
				  },
				  {
					  data:'ece476'
					 
				  },
				  {
					  data:'ece437'
					 
				  },
				  {
					  data:'ece438'
					 
				  },
				  {
					  data:'ece477'
					 
				  },
				  {
					  data:'ece478'
					 
				  }, {
					  data:'ece439'
					 
				  }, {
					  data:'ece435'
					 
				  },{
					  data:'ece404'
					 
				  },
				  {
					  data:'ece400'
					 
				  },
				  {
					  data:'gpa'
					 
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

