package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.Swagger2SpringBoot;
import services.UserService;
import io.swagger.annotations.*;
import database.entyties.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.util.LinkedList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-05-01T12:06:10.099Z[GMT]")
@Controller
public class UserApiController implements UserApi {

    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @RequestMapping(value="/user", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<List<User>> listUser (@NotNull @ApiParam(value = "pass an optional UserId for looking up users", required = true)
                                                    @Valid @RequestParam(value = "idUser", required = true) String idUser) {
        String accept = request.getHeader("Accept");
        System.out.println(new ResponseEntity<List<User>>(HttpStatus.OK).toString());

        UserService service = Swagger2SpringBoot.getService();
        List<User> list = new LinkedList<>();

        User testUser = service.findById(idUser);
        list.add(testUser);
        ResponseEntity<List<User>> list2 = new ResponseEntity<List<User>>(list, HttpStatus.I_AM_A_TEAPOT);
        return list2;
    }

}
