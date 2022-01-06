import React,{Component} from "react";
class ButtonClass extends Component {
    state = {Name:'Akhil',UserName:'777450'};
    constructor(props){
        super(props);
        this.state={surName:"Aithagani"}
    }
    componentDidMount(){
        this.setState({surName:"Updated"})
    }
    render(){
        return(
            <div><button>Submit2</button>
            <h1>{this.state.Name}</h1>
            <h2>{this.state.UserName}</h2>
            <h3>{this.state.surName}</h3></div>
        )
    }
}
export default ButtonClass;