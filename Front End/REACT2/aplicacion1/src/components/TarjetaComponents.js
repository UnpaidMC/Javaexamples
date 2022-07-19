import React from "react";

const TarjetaComponent = ({usuario, tarjetaDelete, setUsuarioEditado}) =>{



return(
    <div className = "card">
    <div className = "card-body">
    <h3 className = "card-title">{usuario.nombre}{usuario.apellido}</h3>
    <p> Edad: {usuario.edad}</p>
    <div className = "d-flex justify-content-end">
    <button className="btn btn-sm btn-outline-primary me-2" onClick={() => setUsuarioEditado(usuario)}>Editar</button>
    <button className="btn btn-sm btn-outline-danger" onClick={() => tarjetaDelete(usuario.key)}>Eliminar</button>
    </div>
    </div>
    </div>
    )
}

{/*El estado vive y muere en el componente*/}
export default TarjetaComponent;