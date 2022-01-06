import logo from './logo.svg';
import react, { Profiler } from 'react';
import './App.css';
import Button1 from './Button1';
import ButtonClass from './ButtonClass';



 
function App() {
  let hello = <h1 align="center">Akhil Frst Page</h1>
  let frst = <h1>Akhil Frst line</h1>
  
  return (
 
    <div className="App">
      <header className="App-header">
        <h1>HELLO WORLD</h1>
        <Button1 title={'click here'}/>
        <ButtonClass/>
        
        
        <img src={logo} className="App-logo" alt="logo" />
       
       
        {hello}
        
        {frst}
        <Cotton></Cotton>
        <Cotton1></Cotton1>
       
       
   
       
      </header>
    </div>
  );
}
const Cotton = () => {
  return <button>Submit</button>
  ;
};
const Cotton1= () => {
  return <h4>Akhil Goud</h4>
  ;
};
 
export default App;
