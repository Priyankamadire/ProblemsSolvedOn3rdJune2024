//React Colours DropDown
import React, { useState } from "react";

const ColourDropDown = () => {
  const colourslist = [
    { value: "red", label: "Red" },
    { value: "blue", label: "Blue" },
    { value: "yellow", label: "Yellow" },
    { value: "orange", label: "Orange" },
    { value: "green", label: "Green" },
  ];
  const [colours, setColours] = useState("");
  const handleColours = (e) => {
    setColours(e.target.value);
  };

  return (
    <div>
      <label htmlFor="colordropdown">Select colour</label>
      <select id="colordropdown" value={colours} onChange={handleColours}>
        <option value="">--Select--</option>
        {colourslist.map((colourss) => (
          <option key={colourss.value} value={colourss.value}>
            {colourss.label}
          </option>
        ))}
      </select>
      {colours && (
        <div
          style={{
            marginTop: "1rem",
            backgroundColor: colours,
            width: "100px",
            height: "50px",
          }}
        ></div>
      )}
    </div>
  );
};

export default ColourDropDown;
