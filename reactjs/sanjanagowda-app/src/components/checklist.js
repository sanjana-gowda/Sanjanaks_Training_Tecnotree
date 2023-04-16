import React, {useState} from "react"
import PasswordChecklist from "react-password-checklist"
  
export default function Password(){
  const [password, setPassword] = useState("")
    const [passwordAgain, setPasswordAgain] = useState("")
    return (
        <form>
      <h3>ReactJs Password Checklist</h3>
            <label>Password:</label>
            <input type="password" 
                   onChange={e => setPassword(e.target.value)}>
            </input>
            <label>Password Again:</label>
            <input type="password" 
                   onChange={e => setPasswordAgain(e.target.value)}>
            </input>
  
            <PasswordChecklist
                rules={["minLength","specialChar",
                        "number","capital","match"]}
                minLength={5}
                value={password}
                valueAgain={passwordAgain}
            />
            <input type="submit" value="submit"></input>
        </form>
    )
};