import React from "react";
import './AppliedPolicy.css';
function AppliedPlicy(){
    return(
    <>
    <h3>
            Applied Policy
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
Categories
        </th>
        <th>
Sum Assurance
        </th>
        <th>
Premium
        </th>
    <th>
        Tenure
    </th>
    <th>

Creation Date
        </th>
        <th>
Applied Status
        </th>
</tr>
<tr>
<td>1</td>
    <td>syska Insurance</td>
    <td>mobile Insurance</td>
    <td>5000</td>
    <td>2000</td>
    <td>10</td>
    <td>May 9,2021</td>
    <td> <button type="button" class="btn btn-secondary">Apply </button ></td>
    
</tr>


<tr>
    <td>2</td>
    <td>SBI Life Insurance</td>
    <td>Life Insurance</td>
    <td>50000</td>
    <td>2000</td>
    <td>20</td>
    <td>May 9,2021</td>
    <td> <button type="button" class="btn btn-secondary">Apply </button ></td>
    
</tr>
<tr>
    <td>3</td>
    <td>Explore Insurance</td>
    <td>Travel Insurance</td>
    <td>20000</td>
    <td>5000</td>
    <td>30</td>
    <td>May 9,2021</td>
    <td> <button type="button" class="btn btn-secondary">Apply </button ></td>
    
</tr>
<tr>
    <td>4</td>
    <td>TVSInsurance</td>
    <td>Motor Insurance</td>
    <td>200000</td>
    <td>3000</td>
    <td>25</td>
    <td>May 9,2021</td>
    <td> <button type="button" class="btn btn-secondary">Apply </button ></td>
    
</tr>
</table> 
</>
)
}
export default AppliedPlicy;
