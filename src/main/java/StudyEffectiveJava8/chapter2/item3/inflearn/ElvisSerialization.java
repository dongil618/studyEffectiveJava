package StudyEffectiveJava8.chapter2.item3.inflearn;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

@Slf4j
public class ElvisSerialization {

    public static void main(String[] args) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            log.error("Error={}", e.getMessage());
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis3 = (Elvis) in.readObject();
            log.info("elvis3 == Elvis.INSTANCE : {}", elvis3 == Elvis.INSTANCE);
        } catch (IOException | ClassNotFoundException e) {
            log.error("Error={}", e.getMessage());
            e.printStackTrace();
        }
    }
}
