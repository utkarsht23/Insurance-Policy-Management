import React, { useState, useEffect } from "react";
import "./Sidebar.css";

function Sidebar() {
  const [isSticky, setSticky] = useState(false);

  useEffect(() => {
    const handleScroll = () => {
      setSticky(window.pageYOffset > 100);
    };

    window.addEventListener("scroll", handleScroll);

    return () => {
      window.removeEventListener("scroll", handleScroll);
    };
  }, []);

  return (
    <div className={`sidebar ${isSticky ? "sticky" : ""}`}>
      {/* Sidebar content goes here */}
    </div>
  );
}

export default Sidebar;
