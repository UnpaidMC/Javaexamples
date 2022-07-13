import React from "react";



const ListadoComponent = ({usuario}) =>{

return(
<div className="col bg-success">
            <h1>Listado de usuarios</h1>
            <h1>{usuario.nombre}</h1>
</div>
)}

export default ListadoComponent;