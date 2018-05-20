$(function() {
	
	//adding a pre loader
	$(window).load(function(){
	
		setTimeout(function(){

			$(".preLoader").fadeOut("slow");
			
		},500);
		
        });
	
	//for accessing ag img and description in result
	
	var $agrtable=$('#agImgResults');
	
	if($agrtable.length){
		console.log('inside the table');
		var jsonUrl=window.contextRoot+ '/ag/all/results';
		
	
	
	$agrtable.DataTable({
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
	
	
//for accessing ag img and description in notices
	
	var $agntable=$('#agImgNotices');
	
	if($agntable.length){
		console.log('inside the table');
		var jsonUrl=window.contextRoot+ '/ag/all/notices';
		
	
	
	$agntable.DataTable({
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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
});

