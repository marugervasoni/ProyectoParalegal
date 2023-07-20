import React from 'react'
import "../styles/header.css";

const Header = () => {
  return (
    <div className='header'>
        <h2>Bienvenido a tu asistente jurídico virtual</h2>
        <img className='logo' src="/src/assets/logo.svg" alt="logo"/>
    </div>
  )
}

export default Header