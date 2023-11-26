import React from "react";

class Register extends React.Component{



    render(){
        return(
			<div>
				
			<head>
			<title>Register</title>
			<meta charset="utf-8" />
			<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
			<link rel="stylesheet" href="assets/css/main.css" />
			<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
			</head>
	

			<header id="header">
				<a href="index.html" class="title">Welcome!</a>
				<nav>
					<ul>
						<li><a href="index.html">Home</a></li>
						<li><a href="generic.html">Generic</a></li>
						<li><a href="elements.html"  class="active">Elements</a></li>
					</ul>
				</nav>
			</header>
		
					
							<h1 class="major">Signup</h1>
			
								
									<h2>Welcome to your Groovy account!</h2>
								
									<form method="post" action="#"/>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-username" id="demo-username" value="" placeholder="username" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="password" name="demo-password" id="demo-password" value="" placeholder="password" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-name" id="demo-name" value="" placeholder="first name" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-last_name" id="demo-last_name" value="" placeholder="last name" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="email" name="demo-email" id="demo-email" value="" placeholder="email" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-streetaddr" id="demo-streetaddr" value="" placeholder="Street address" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-city" id="demo-city" value="" placeholder="City" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-state" id="demo-state" value="" placeholder="State(two letters)" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-zip" id="demo-zip" value="" placeholder="zip code" />
											</div>
											<br>
											<div class="col-6 col-12-xsmall">
												<input type="text" name="demo-Country" id="demo-Country" value="" placeholder="Country" />
											</div>	
									</form>
									
									



                
            
            </div>
    
        );



    }



}
export default Register;



