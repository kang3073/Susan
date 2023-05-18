$(document).ready(function(){ 
	getSales();
		function getSales(){
// Ajax 시작
    	  	$.ajax({
	  			url:'/chart/sales',
	  			type:"GET",
	  			dataType:'json',
	  			success:function(arr){
	  			
	  				// 자료 리스트 변수
			  		let nameList = [];
    	  			let numList = [];

			 		// 그래프로 나타낼 자료 리스트에 담기
			  		for (let i = 0; i<arr.length;i++){
							nameList.push(arr[i].saleDate);    				  
							numList.push(arr[i].salePrice);    				  
  					}
  					// 변수를 view 파일에 출력할 getElementById 저장
				const ctx = document.getElementById('mySales').getContext('2d');
					// 그래프 설정
					
				const mySales = new Chart(ctx, {
					type: 'line',
					data: {
					labels: nameList,
					datasets: [{
					data: numList,
			 		backgroundColor: "#3e95cd",
			 		fill: false,
			        borderWidth: 5
			        }]
			    },
			    
    			options: {
    				legend: {
    					display: false
    					},
        			title: {
        			display: true,
        			text: '판매 총액',
        			scales: {
        			 	xAxes: [{
     						 ticks: {
        						fontSize: 20 // X축 레이블 값의 글자 크기
      								}
    							}],
    							
            		 yAxes: [{
                		ticks: {
                    		fontSize: 20, // Y축 레이블 값의 글자 크기
                    		stepSize: 1000,
                    		min: 0
                				}
            				}]
        				   } // scales
        				  } // title
    				  } // options;
					}) // success:function(arr)
				},
				
    	  }); // ajax

      } //  getGraph

}); //document.ready