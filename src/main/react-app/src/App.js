import axios from "axios";
import React, {useState, useEffect} from "react";
import "./components/Container";
import Container from "./components/Container";


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
      <Container />
      <Questions />
    </div>
  );
}

export default App;
