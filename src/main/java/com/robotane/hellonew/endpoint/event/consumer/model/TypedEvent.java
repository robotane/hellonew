package com.robotane.hellonew.endpoint.event.consumer.model;

import com.robotane.hellonew.PojaGenerated;
import com.robotane.hellonew.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
