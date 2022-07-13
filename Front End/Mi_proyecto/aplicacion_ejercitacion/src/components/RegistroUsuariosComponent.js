import React from "react";
import ListadoComponent from "./ListadoComponent";

const usuarios=[

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

const RegistroUsuarioComponent = () => {
    return (
        <div>
        {
        usuarios.map(usuario => <ListadoComponent key = {usuario.key} usuario= {usuario}/>)    
}
</div>
);
}

export default RegistroUsuarioComponent;