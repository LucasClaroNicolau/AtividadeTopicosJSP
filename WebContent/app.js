var app = angular.module('App', ['ngMaterial', 'ngMessages','ngRoute'])

app.config(function($routeProvider){

	$routeProvider
	.when("/",{
		templateUrl : "home.html",
	})
	.when("/AtividadeTopicosJSP/imc", {
	     templateUrl: "index.jsp",
	});
});
app.controller('form', function($scope, $http){
	$scope.enviar = function(){
		$http.get("/AtividadeTopicosJSP/imc")
		  .then(function(response) {
		    alert("deu");
		    
		  });
	}  		
}); 
		
