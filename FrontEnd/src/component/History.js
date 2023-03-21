import React from "react";
import './ApplyPolicy.css';
function History(){
return(
<>
<h3>
        History
    </h3>
<table id="customers">
    
    <tr>
        <th>
Serial No
        </th>
        <th>
Policy Name
        </th>
        <th>
Applied Date
        </th>
        <th>
Status
        </th>
        <th>
Apply
        </th>

</tr>
<tr>
    <td>1</td>
    <td>TVS Insurance</td>
    
    
    <td>June 10,2021</td>
    <td>Pending</td>
    <td> <button type="button" class="btn btn-secondary">Apply </button ></td>
    
</tr>




</table> 
</>
)
}
export default History ;

