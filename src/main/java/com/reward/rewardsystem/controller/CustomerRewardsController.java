package com.reward.rewardsystem.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRewardsController {




    //TODO swagger tags
//    @Operation(summary = "get reward point by customer id", description = "Returns a reward point by considering 3 months transaction of specific customer", tags = {"reward"})
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "successful operation",
//                    content = @Content(schema = @Schema(implementation = QueueListBean.class))),
//            @ApiResponse(responseCode = "400", description = "Bad Request",
//                    content = @Content(schema = @Schema(implementation = ErrorBean.class))),
//            @ApiResponse(responseCode = "500", description = "Internal Server Error",
//                    content = @Content(schema = @Schema(implementation = ErrorBean.class)))
//    })
//    @GetMapping(value = "/customer/{customerId}/reward", produces = "application/json")
//    public ResponseEntity getRewardByCustomerId(@PathVariable("customerId") int customerId){
//        int reward  = customerRewardService.getRewardByCustomerId(customerId);
//        return ResponseEntity.status(HttpStatus.OK).body(reward);
//    }
}
