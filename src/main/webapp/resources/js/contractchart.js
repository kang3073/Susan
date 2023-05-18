$(document).ready(function(){
	getGraph();
		function getGraph(){
// Ajax 시작
	   		$.ajax({
	  			url:'/chart/rank',
     		  	type:"GET",
	  			dataType:'json',
	  			success:function(arr){
	  			
					// 자료 리스트 변수
			  		let menuList = [];
		  			let countList = [];
	
			 		// 그래프로 나타낼 자료 리스트에 담기
			  		for (let i = 0; i<arr.length;i++){
							menuList.push(arr[i].menu);    				  
							countList.push(arr[i].count);    				  
			  		}
    			  	// 변수를 view 파일에 출력할 getElementById 저장				
				const ctx = document.getElementById('myChart').getContext('2d');
					// 그래프 설정
					
				const myChart = new Chart(ctx, {
					type: 'bar',
					data: {
					labels: menuList,
					datasets: [{
					
					data: countList,
			 		backgroundColor: [
    				'rgba(243, 121, 126, 1)',
    				'rgba(125, 160, 250, 1)',
    				'rgba(71, 71, 161, 1)',
    				'rgba(218, 231, 255, 1)',
    				'rgba(81, 79, 175, 1)'
						],
						
					borderColor: [
	                'rgba(243, 121, 126, 1)',
	                'rgba(125, 160, 250, 1)',
	                'rgba(71, 71, 161, 1)',
	                'rgba(218, 231, 255, 1)',
	                'rgba(81, 79, 175, 1)'
			            ],
			            
		            borderWidth: 5
						        }]
						    },
						    
    			options: {
    				legend: {
    					display: false
    					},
    				title: {
        			display: true,
        			text: '판매량 순위',
        			scales: {
						xAxes: [{
      						ticks: {
        						fontSize: 20 // X축 레이블 값의 글자 크기
      								}
    							}],
    						
						yAxes: [{
                			ticks: {
                   				fontSize: 20, // Y축 레이블 값의 글자 크기
			                    stepSize: 1,
			                    min: 0
                					}
            					}]
    						}// scales
        					}// title
    					}// options
					})// const myChart = new Chart;
				}, 
				
    	  }); // ajax
      } //  getGraph
}); //document.ready
