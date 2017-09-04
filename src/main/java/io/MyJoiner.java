package io;

/**
 * @author Igor Hnes on 9/4/17.
 */
public class MyJoiner {


        private String contact;
        private StringBuilder builder = new StringBuilder();

        public MyJoiner(String contact) {
            this.contact = contact;
        }

        public void add(String text) {
            if (builder.length() != 0) {
                builder.append(contact);
            }
            builder.append(text);
        }

        public void clear() {
            builder.setLength(0);
        }

        @Override
        public String toString() {
            return builder.toString();
        }
}
