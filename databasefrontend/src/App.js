import Index from './pages/index';
import About from './pages/about';
import Login from './pages/login';
import Register from './pages/register';
import Shop from './pages/shop';
import { BrowserRouter, Routes, Route } from "react-router-dom";
import './App.css';

function App() {

var loadScript = function(src) {
  var tag = document.createElement('script');
  tag.async = false;
  tag.src = src;
  document.getElementsByTagName('body')[0].appendChild(tag);
}



loadScript('assets/js/jquery.min.js')
loadScript('assets/js/jquery.scrollex.min.js')
loadScript('assets/js/jquery.scrolly.min.js')
loadScript('assets/js/browser.min.js')
loadScript('assets/js/breakpoints.min.js')
loadScript('assets/js/util.js')
loadScript('assets/js/main.js')

    return (
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Index />}></Route>
          <Route path="/about" element={<About />}></Route>
          <Route path="/login" element={<Login />}></Route>
          <Route path="/register" element={<Register />}></Route>
          <Route path="/shop" element={<Shop />}></Route>
          
        </Routes>
      </BrowserRouter> 

    
    );
  
}

export default App;
