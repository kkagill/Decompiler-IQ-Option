//
//  textured_vs.glsl
//  GLChart
//
//  Created by Pavel Kosov on 10/04/2017.
//  Copyright © 2017 IQOPTION. All rights reserved.
//


attribute vec4 a_Position;
attribute vec4 a_Color;
attribute vec2 a_TexCoord;
varying vec2 v_TexCoord;
varying vec4 v_Color;

uniform mat4 u_TransMatrix;
uniform vec4 u_RotationCoeffs;


void main()
{
    v_TexCoord = a_TexCoord;
    v_Color = a_Color;

    if (u_RotationCoeffs[0] != 0.0)
    {
        float angle = radians(u_RotationCoeffs[0]);

        float pivX = u_RotationCoeffs[1];
        float pivY = u_RotationCoeffs[2];
        float s = sin(-angle);
        float c = cos(-angle);

        // TODO: One matrix
        float delta_x = -1.0 * pivX;
        float delta_y = -1.0 * pivY;
        mat4 to_center_mat = mat4(
            vec4(1.0,      0.0,       0.0,   0.0),    // x
            vec4(0.0,      1.0,       0.0,   0.0),    // y
            vec4(0.0,      0.0,       1.0,   0.0),    // z
            vec4(delta_x,  delta_y,   0.0,   1.0)     // transition
        );

        mat4 rot_mat = mat4(
            vec4(c,        s,       0.0,    0.0),    // x
            vec4(-s,       c,       0.0,    0.0),    // y
            vec4(0.0,      0.0,     1.0,    0.0),    // z
            vec4(0.0,      0.0,     0.0,    1.0)     // transition
        );

        mat4 from_center_mat = mat4(
            vec4(1.0,       0.0,       0.0,   0.0),    // x
            vec4(0.0,       1.0,       0.0,   0.0),    // y
            vec4(0.0,       0.0,       1.0,   0.0),    // z
            vec4(-delta_x, -delta_y,   0.0,   1.0)     // transition
        );

        mat4 RotationM = from_center_mat * rot_mat * to_center_mat;
        gl_Position = u_TransMatrix * RotationM * a_Position;
    }
    else
    {
        gl_Position = u_TransMatrix * a_Position;
    }
}
