package com.example.androidfundamentals04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class EventsActivity extends AppCompatActivity {

    private List<Event> events;
    private RecyclerView recyclerViewEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        getEvents();
        recyclerViewEvents = findViewById(R.id.recyclerViewEvents);
        setLayoutManager(recyclerViewEvents);
        setAdapter(recyclerViewEvents);


    }

    private void getEvents() {
        events = new ArrayList<Event>();
        for (int i = 0; i < 30; i++) {
            Event event = new Event();
            event.setName("Untold " + i);
            event.setAddress("Cluj " + i);
            event.setStartDate(new Date());
            event.setDescription("Un event cool " + i);
            event.setUrlImage("https://www.romania-insider.com/sites/default/files/styles/article_large_image/public/featured_images/untold-2017.jpg\n");
            events.add(event);
        }
    }

    private void setLayoutManager(RecyclerView recyclerViewEvents) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerViewEvents.setLayoutManager(linearLayoutManager);
    }

    private void setAdapter(RecyclerView recyclerViewEvents) {
        EventsAdapter eventsAdapter = new EventsAdapter(events);
        recyclerViewEvents.setAdapter(eventsAdapter);
    }

//    private void setRecyclerViewListener(RecyclerView recyclerView) {
//
//    }
}
