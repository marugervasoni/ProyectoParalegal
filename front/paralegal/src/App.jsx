import { useState } from 'react'
import './App.css'
import Header from './Components/Header'
import Footer from './Components/Footer'
import Home from './Routes/Home'

function App() {
  return (
    <>
      <Header/>
      {/*instalar para poder importar <Routes> */}
      <Home/>
      {/* </Routes> */}
      <Footer/>
    </>
  )
}

export default App
