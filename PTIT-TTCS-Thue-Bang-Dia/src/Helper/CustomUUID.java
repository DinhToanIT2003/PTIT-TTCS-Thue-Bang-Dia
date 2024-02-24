package Helper;

import java.util.UUID;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CustomUUID {
    public String getUuid() {
        // Tạo UUID ngẫu nhiên
        UUID randomUUID = UUID.randomUUID();
        UUID customUUID = null;

        // Chuyển UUID thành chuỗi
        String uuidString = randomUUID.toString();

        // Tạo mã băm từ chuỗi UUID
        try {
            MessageDigest salt = MessageDigest.getInstance("SHA-256");
            salt.update(uuidString.getBytes("UTF-8"));
            byte[] digest = salt.digest();

            // Lấy 6 byte đầu tiên từ mã băm để tạo UUID mới
            long mostSigBits = 0;
            for (int i = 0; i < 8; i++) {
                mostSigBits = (mostSigBits << 8) | (digest[i] & 0xff);
            }

            customUUID = new UUID(mostSigBits, randomUUID.getLeastSignificantBits());

            
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customUUID.toString();
    }
}
