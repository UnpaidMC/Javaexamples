import React from "react";
import RegistroComponent from "./components/RegistroComponents";
import ListadoComponent from "./components/ListadoComponent"
import RegistroUsuarioComponent from "./components/RegistroUsuariosComponent";

const App = () => {
return (
    <div className = "container mt-4">
        <div className="row">
            <div className="col-4 bg-warning">
            <h1>Registrate</h1>
            <RegistroComponent/>
            </div>
            <div className="col bg-danger">
            <h1>Cursos</h1>
            </div>
            <RegistroUsuarioComponent/>
            </div>
        </div>
    )

};

export default App;