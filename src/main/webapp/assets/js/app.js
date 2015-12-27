/**
 * Created by Cristian on 27/12/2015.
 */

var app = angular.module('app', ['ngRoute']);

app.config(function($routeProvider) {
    //$locationProvider.html5Mode(true);

    $routeProvider

        .when('/', {
            templateUrl: 'views/home.html',
            controller: 'mainController'
        })
        .when('/app', {
            templateUrl: 'views/home.html',
            controller: 'mainController'
        })
        .when('/app/publicacion/nuevo', {
            templateUrl: 'views/nuevaPublicacion.html',
            controller: 'publicacionController'
        })
        .when('/error', {
            templateUrl: 'views/error.html',
            controller: 'emptyController'
        })
        .otherwise({
            redirectTo: '/error'
        });



    //$httpProvider.interceptors.push('myHttpInterceptor');
});
