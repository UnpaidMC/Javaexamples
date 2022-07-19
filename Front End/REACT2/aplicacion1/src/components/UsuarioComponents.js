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
    const [usuarioEditado, setUsuarioEditado] = useState(null);
    {/*const state   = useState(initialUsuarios)
    state[0] = intialUsuarios
    state[1] = funcion que nos permite hacer cambios
*/}

{/*Declaro funcion pero aun no se usa hasta que se llame*/}
    const tarjetaDelete = (usuarioKey) =>{
    const changeUsuarios = usuarios.filter(u => u.key !== usuarioKey)
    setUsuarios(changeUsuarios)
    }
    {/*changeUsuarios guarda temporalmebte las llaves que no son las que yo ingreso*/}

    const usuarioAdd = (usuario) =>{

        const addUsuarios = [
        ...usuarios,
        usuario
        ]
        setUsuarios(addUsuarios);
        }
    
    const usuarioEdit=(usuarioEditado)=>{
        const changeUsuarios = usuarios.map(usuario =>usuario.key === usuarioEditado.key ? usuarioEditado: usuario)
        setUsuarios(changeUsuarios)
    }


    return (<div className = "container mt-4">
    <div className="row">
    <div className="col-8 bg-warning">
        <h1>Lista</h1>
        {
            usuarios.map(usuario => <TarjetaComponent 
                key = {usuario.key} 
                usuario= {usuario} 
                setUsuarioEditado = {setUsuarioEditado}
                tarjetaDelete={tarjetaDelete}
                usuarioEdit={usuarioEdit}/>)
        }
        
        </div>
        <div className="col bg-danger">
            <h1>{usuarioEditado ? "Modifica tus datos": "Ingresa tus datos"}</h1>
            <FormularioComponent 
            usuarioAdd= {usuarioAdd}
            usuarioEditado = {usuarioEditado}
            usuarioEdit={usuarioEdit}
            setUsuarioEditado={setUsuarioEditado}/>
        </div>
        </div>
        </div>
        );
    }
export default UsuarioComponent;