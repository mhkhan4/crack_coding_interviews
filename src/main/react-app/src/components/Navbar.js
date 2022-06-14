import "./Navbar.css"
import logo from "../images/logo.png";

const Navbar = () =>{
    return (
      <div class="navbar">
        <img class="logo" src={logo} alt="logo"/>
        <nav>
            <ul class="nav_links">
                <li><a href="/#">Interview</a></li>
                <li><a href="/#">Data Structures</a></li>
                <li><a href="/#">Algorithm</a></li>
            </ul>
        </nav>
      </div>
    );
}

export default Navbar;