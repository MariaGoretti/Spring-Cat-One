package com.ics.one.mock;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@FeignClient(name = "Maria 94910", url = "http://10.51.13.251:1000")
@FeignClient(name = "client", url = "http://10.55.46.135:9090")
public interface MockRestClient {
    //register with stud_id + name
    @RequestMapping(method = RequestMethod.POST, value = "students")
    Student createStudent (@RequestBody Student student);

    //fetching all lecturers
    @RequestMapping (method = RequestMethod.GET, value = "lecturers")
    List<Teacher> getAllLecturers();

    //create appointment
    @RequestMapping(method = RequestMethod.POST, value = "appointments")
    Appointment createAppointmnet(@RequestBody Appointment appointment);

    //confirm appointment
    @RequestMapping(method = RequestMethod.PATCH, value = "appointments/{appointmentId}")
    Appointment ConfirmAppointment(@PathVariable("appointmentId") Long id, @RequestParam(name = "studentId") Long studentId);

}
