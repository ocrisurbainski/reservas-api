package com.urbainski.reservasapi.reservations.infra.controller;

import com.urbainski.reservasapi.reservations.domain.Reservation;
import com.urbainski.reservasapi.reservations.infra.controller.dto.CreateReservationRequestDTO;
import com.urbainski.reservasapi.reservations.infra.controller.dto.CreateReservationResponseDTO;
import com.urbainski.reservasapi.reservations.infra.controller.dto.GetAllReservationResponseDTO;
import com.urbainski.reservasapi.reservations.infra.controller.dto.GetReservationByIdResponseDTO;

@org.mapstruct.Mapper(componentModel = "spring")
public interface ReservationControllerMapper {

    Reservation toReservation(CreateReservationRequestDTO dto);

    CreateReservationResponseDTO toCreateReservationResponseDTO(Reservation reservation);

    GetReservationByIdResponseDTO toGetReservationByIdResponseDTO(Reservation reservation);

    GetAllReservationResponseDTO toGetAllReservationResponseDTO(Reservation reservation);

}
