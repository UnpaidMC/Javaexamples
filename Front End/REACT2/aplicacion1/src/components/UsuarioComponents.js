import React,{useState} from "react";
import TarjetaComponent from "./TarjetaComponents"
import FormularioComponent from "./FormularioComponents";


const initialUsuarios=[

    {
        key: '0',
        nombre: 'Carlos',
        apellido: 'Tapia',
        edad: '21'
    },
    {
        key: '1',
        nombre: 'Michael',
        apellido: 'Roldan',
        edad: '28'
    },
    {
        key: '2',
        nombre: 'Emily',
        apellido: 'Gonzalez',
        edad: '28'
    }

]


const UsuarioComponent = () => {

    const [usuarios, setUsuarios] = useState(initialUsuarios);
    {/*const state   = useState(initialUsuarios)
    state[0] = intialUsuarios
    state[1] = funcion que nos permite hacer cambios
*/}

    const tarjetaDelete = (usuarioKey) =>{
    const changeUsuarios = usuarios.filter(u => u.key !== usuarioKey)
    setUsuarios(changeUsuarios)
    }

    const usuarioAdd = (usuario) =>{

        const addUsuarios = [
        ...usuarios,
        usuario
        ]
        setUsuarios(addUsuarios);
        }
    

    return (<div className = "container mt-4">
    <div className="row">
    <div className="col-8 bg-warning">
        <h1>Lista</h1>
        {
            usuarios.map(usuario => <TarjetaComponent 
                key = {usuario.key} 
                usuario= {usuario} 
                tarjetaDelete={tarjetaDelete}/>)
        }
        
        </div>
        <div className="col bg-danger">
            <h1>Formulario</h1>
            <FormularioComponent usuarioAdd= {usuarioAdd}/>
        </div>
        </div>
        </div>
        );
    }
export default UsuarioComponent;