import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Signal;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {


        Gear gear = new Gear(4);
        var ee = gear.getGearNumber();
        System.out.println("heellooo! " + ee);

    }

    private static Flux<Long> fakeControlIterationOfMPU() {
        return Flux.interval(Duration.ofMillis(500)); //configurable
    }
}
