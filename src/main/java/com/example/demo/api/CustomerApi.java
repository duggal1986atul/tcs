/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.0.0-beta2).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import com.example.demo.model.Customer;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-19T17:41:31.818399+10:00[Australia/Melbourne]")
@Validated
@Api(value = "customer", description = "the customer API")
public interface CustomerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /customer : Add a Customer
     *
     * @param customer Customer to be added (required)
     * @return Customer Added (status code 200)
     */
    @ApiOperation(value = "Add a Customer", nickname = "addCustomer", notes = "", response = String.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Customer Added", response = String.class) })
    @PostMapping(
        value = "/customer",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<String> _addCustomer(@ApiParam(value = "Customer to be added" ,required=true )  @Valid @RequestBody Customer customer) {
        return addCustomer(customer);
    }

    // Override this method
    default  ResponseEntity<String> addCustomer(Customer customer) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /customer : Get Customer
     *
     * @return successful operation (status code 200)
     */
    @ApiOperation(value = "Get Customer", nickname = "getCustomer", notes = "", response = Customer.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Customer.class, responseContainer = "List") })
    @GetMapping(
        value = "/customer",
        produces = { "application/json" }
    )
    default ResponseEntity<List<Customer>> _getCustomer() {
        return getCustomer();
    }

    // Override this method
    default  ResponseEntity<List<Customer>> getCustomer() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"registrationDate\" : \"2017-07-21T17:32:28Z\", \"id\" : 0, \"age\" : 6 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}