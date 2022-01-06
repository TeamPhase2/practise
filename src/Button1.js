import React,{useState} from "react";
function Button1(props) {
    
 const [title1,setTitle]=useState("Submit from function");

    return(
    

        <button onClick={()=>setTitle('Updated title')}>{title1}</button>
    )
    
         
     
     
    
}
export default Button1;