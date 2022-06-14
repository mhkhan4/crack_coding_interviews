import axios from "axios";
import React, {useState, useEffect} from "react";
import Container from "./components/Container";
import WelcomeMsg from "./components/WelcomeMsg"
import Navbar from "./components/Navbar";


const Questions = () =>{
  const fetchAllQuestions = () => {
    axios.get("http://localhost:8080/api/questions").then(res => {
      console.log(res);
    });
  };

  useEffect( () =>{
    fetchAllQuestions();
  }, []);

  return "";
};

function App() {
  return (
    <div className="App">
      <Navbar />
      {/*<WelcomeMsg />*/}
      <Container />
    </div>
  );
}

export default App;
