import React from "react";

class Register extends React.Component{



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
                <li><a href="/shop">Shop</a></li>
                <li><a href="/login"  class="active">Login</a></li>
            </ul>
        </nav>
    </header>


    <div id="wrapper">

   
            <section id="main" class="wrapper"/>
                
                <div class="inner">
                    <h1 class="major">Login </h1>
					<form>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-username" id="demo-username" value="" placeholder="username" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="password" name="demo-password" id="demo-password" value="" placeholder="password" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-name" id="demo-name" value="" placeholder="first name" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-last_name" id="demo-last_name" value="" placeholder="last name" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="email" name="demo-email" id="demo-email" value="" placeholder="email" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
					<input type="text" name="demo-streetaddr" id="demo-streetaddr" value="" placeholder="Street address" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-state" id="demo-state" value="" placeholder="State(two letters)" />
					</div>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-zip" id="demo-zip" value="" placeholder="zip code" />
					</div>
					<br></br>
					<div class="col-6 col-12-xsmall">
						<input type="text" name="demo-Country" id="demo-Country" value="" placeholder="Country" />
					</div>
											
					

					</form>

							
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
export default Register;



