import logo from './logo.svg';
import './App.css';

 
function App() {
  let Akh = <h1 align="center">Akhil Frst Page</h1>
  let Akh1 = <h2 align="center">Akhil Frst line</h2>
  
  return (
 
    <div className="App">
      <header className="App-header">
        <h1>HELLO WORLD</h1>
        
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
        {Akh}
        {Akh1}
        <Cotton></Cotton>
       
      </header>
    </div>
  );
}
const Cotton = () => {
  return <h1>hello</h1>;
};
 
export default App;
