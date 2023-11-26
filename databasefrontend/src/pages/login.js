import React from "react";

class Login extends React.Component{



    render(){
        return(
            <div>
	<head>
		<title>Login</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="assets/css/main.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
    <body class="is-preload"/>

    <header id="header">
        <a href="/" class="title">Groovy Grove Records</a>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="generic.html">Shop</a></li>
                <li><a href="/login"  class="active">Login</a></li>
            </ul>
        </nav>
    </header>


    <div id="wrapper">

   
            <section id="main" class="wrapper"/>
                
                <div class="inner">
                    <h1 class="major">Login </h1>
                            <div class="field half">
                                <label for="name">email/username</label>
                                <input type="text" name="name" id="name" />
                            </div>
                            <div class="field half">
                                <label for="email">password</label>
                                <input type="text" name="email" id="email" />
                            </div>
                            <ul class="menu">
                                <li> Forgot <a href="http://html5up.net">Password?</a></li>
                                <li> Create your <a href="http://html5up.net">Groovy account</a></li>
                            </ul>
                        </div>
                   
             </div>
            <script src="assets/js/jquery.min.js"></script>
			<script src="assets/js/jquery.scrollex.min.js"></script>
			<script src="assets/js/jquery.scrolly.min.js"></script>
			<script src="assets/js/browser.min.js"></script>
			<script src="assets/js/breakpoints.min.js"></script>
			<script src="assets/js/util.js"></script>
			<script src="assets/js/main.js"></script>

             
            </div>
               );
    
}
}

export default Login;
